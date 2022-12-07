(ns ogbe.fulcro.mui.icons.cabin-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CabinOutlined" :default CabinOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cabin-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CabinOutlined)))