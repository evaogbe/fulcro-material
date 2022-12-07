(ns ogbe.fulcro.mui.icons.call-to-action
  #?(:cljs (:require
            ["@mui/icons-material/CallToAction" :default CallToAction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-to-action
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallToAction)))