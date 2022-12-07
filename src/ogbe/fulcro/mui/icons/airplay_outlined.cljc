(ns ogbe.fulcro.mui.icons.airplay-outlined
  #?(:cljs (:require
            ["@mui/icons-material/AirplayOutlined" :default AirplayOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplay-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplayOutlined)))