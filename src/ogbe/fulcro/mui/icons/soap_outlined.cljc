(ns ogbe.fulcro.mui.icons.soap-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SoapOutlined" :default SoapOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-soap-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SoapOutlined)))