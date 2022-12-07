(ns ogbe.fulcro.mui.icons.perm-media
  #?(:cljs (:require
            ["@mui/icons-material/PermMedia" :default PermMedia]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-perm-media
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PermMedia)))