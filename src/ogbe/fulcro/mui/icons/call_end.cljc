(ns ogbe.fulcro.mui.icons.call-end
  #?(:cljs (:require
            ["@mui/icons-material/CallEnd" :default CallEnd]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-end
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallEnd)))