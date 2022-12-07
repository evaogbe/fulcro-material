(ns ogbe.fulcro.mui.icons.remove-red-eye
  #?(:cljs (:require
            ["@mui/icons-material/RemoveRedEye" :default RemoveRedEye]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-remove-red-eye
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RemoveRedEye)))