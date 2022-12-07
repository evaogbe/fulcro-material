(ns ogbe.fulcro.mui.icons.sensors-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SensorsOutlined" :default SensorsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sensors-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SensorsOutlined)))