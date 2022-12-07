(ns ogbe.fulcro.mui.icons.share-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShareSharp" :default ShareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-share-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShareSharp)))