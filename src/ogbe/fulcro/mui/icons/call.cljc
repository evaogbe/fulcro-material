(ns ogbe.fulcro.mui.icons.call
  #?(:cljs (:require
            ["@mui/icons-material/Call" :default Call]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Call)))