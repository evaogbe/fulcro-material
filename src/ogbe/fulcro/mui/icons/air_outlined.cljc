(ns ogbe.fulcro.mui.icons.air-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AirOutlined" :default AirOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-air-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirOutlined)))