(ns ogbe.fulcro.mui.icons.next-plan
  #?(:cljs (:require
            ["@mui/icons-material/NextPlan" :default NextPlan]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-next-plan
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NextPlan)))