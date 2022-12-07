(ns ogbe.fulcro.mui.icons.sick-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SickOutlined" :default SickOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sick-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SickOutlined)))