(ns ogbe.fulcro.mui.icons.water-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WaterOutlined" :default WaterOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-water-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WaterOutlined)))