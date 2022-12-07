(ns ogbe.fulcro.mui.icons.photo-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PhotoSharp" :default PhotoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoSharp)))