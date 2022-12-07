(ns ogbe.fulcro.mui.icons.publish
  #?(:cljs (:require
            ["@mui/icons-material/Publish" :default Publish]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-publish
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Publish)))