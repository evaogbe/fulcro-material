(ns ogbe.fulcro.mui.icons.low-priority
  #?(:cljs (:require
            ["@mui/icons-material/LowPriority" :default LowPriority]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-low-priority
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LowPriority)))