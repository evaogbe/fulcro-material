(ns ogbe.fulcro.mui.icons.sd-card-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SdCardOutlined" :default SdCardOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-card-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdCardOutlined)))