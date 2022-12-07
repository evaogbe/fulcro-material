(ns ogbe.fulcro.mui.icons.sos-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SosOutlined" :default SosOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sos-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SosOutlined)))