(ns ogbe.fulcro.mui.icons.share-location-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShareLocationSharp" :default ShareLocationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-location-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareLocationSharp)))