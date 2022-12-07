(ns ogbe.fulcro.mui.icons.map-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MapOutlined" :default MapOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-map-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MapOutlined)))