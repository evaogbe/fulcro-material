(ns ogbe.fulcro.mui.icons.photo-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PhotoTwoTone" :default PhotoTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoTwoTone)))