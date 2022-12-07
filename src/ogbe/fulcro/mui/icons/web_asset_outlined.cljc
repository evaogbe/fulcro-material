(ns ogbe.fulcro.mui.icons.web-asset-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WebAssetOutlined" :default WebAssetOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-asset-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebAssetOutlined)))