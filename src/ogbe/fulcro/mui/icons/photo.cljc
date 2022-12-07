(ns ogbe.fulcro.mui.icons.photo
  #?(:cljs (:require
            ["@mui/icons-material/Photo" :default Photo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Photo)))