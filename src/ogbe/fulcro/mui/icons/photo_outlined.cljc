(ns ogbe.fulcro.mui.icons.photo-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PhotoOutlined" :default PhotoOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-photo-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhotoOutlined)))