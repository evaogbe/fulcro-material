(ns ogbe.fulcro.mui.icons.garage-outlined
  #?(:cljs (:require
            ["@mui/icons-material/GarageOutlined" :default GarageOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-garage-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GarageOutlined)))