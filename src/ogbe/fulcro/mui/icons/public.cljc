(ns ogbe.fulcro.mui.icons.public
  #?(:cljs (:require
            ["@mui/icons-material/Public" :default Public]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-public
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Public)))