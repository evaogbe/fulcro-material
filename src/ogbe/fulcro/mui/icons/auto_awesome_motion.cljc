(ns ogbe.fulcro.mui.icons.auto-awesome-motion
  #?(:cljs (:require
            ["@mui/icons-material/AutoAwesomeMotion" :default AutoAwesomeMotion]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-awesome-motion
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoAwesomeMotion)))