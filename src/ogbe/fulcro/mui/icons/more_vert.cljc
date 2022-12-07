(ns ogbe.fulcro.mui.icons.more-vert
  #?(:cljs (:require
            ["@mui/icons-material/MoreVert" :default MoreVert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-more-vert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MoreVert)))