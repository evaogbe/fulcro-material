(ns ogbe.fulcro.mui.icons.web-asset-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WebAssetSharp" :default WebAssetSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-asset-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebAssetSharp)))