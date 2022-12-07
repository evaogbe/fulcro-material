(ns ogbe.fulcro.mui.icons.accessible-forward
  #?(:cljs (:require
            ["@mui/icons-material/AccessibleForward" :default AccessibleForward]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible-forward
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibleForward)))