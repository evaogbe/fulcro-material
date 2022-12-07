(ns ogbe.fulcro.mui.icons.cottage
  #?(:cljs (:require
            ["@mui/icons-material/Cottage" :default Cottage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cottage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Cottage)))