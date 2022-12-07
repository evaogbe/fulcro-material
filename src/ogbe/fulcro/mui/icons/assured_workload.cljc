(ns ogbe.fulcro.mui.icons.assured-workload
  #?(:cljs (:require
            ["@mui/icons-material/AssuredWorkload" :default AssuredWorkload]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-assured-workload
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AssuredWorkload)))