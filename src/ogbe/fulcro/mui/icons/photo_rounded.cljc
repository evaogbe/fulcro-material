(ns ogbe.fulcro.mui.icons.photo-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhotoRounded" :default PhotoRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoRounded)))