(ns ogbe.fulcro.mui.icons.ssid-chart
  #?(:cljs (:require
            ["@mui/icons-material/SsidChart" :default SsidChart]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ssid-chart
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SsidChart)))