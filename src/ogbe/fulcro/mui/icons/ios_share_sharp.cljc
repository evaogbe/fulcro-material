(ns ogbe.fulcro.mui.icons.ios-share-sharp
  #?(:cljs (:require
            ["@mui/icons-material/IosShareSharp" :default IosShareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ios-share-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IosShareSharp)))