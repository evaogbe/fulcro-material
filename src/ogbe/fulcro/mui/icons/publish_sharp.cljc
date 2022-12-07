(ns ogbe.fulcro.mui.icons.publish-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PublishSharp" :default PublishSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-publish-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PublishSharp)))