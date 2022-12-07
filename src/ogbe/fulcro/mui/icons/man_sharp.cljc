(ns ogbe.fulcro.mui.icons.man-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ManSharp" :default ManSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-man-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ManSharp)))