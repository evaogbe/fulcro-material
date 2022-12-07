(ns ogbe.fulcro.mui.icons.check-box-outline-blank
  #?(:cljs (:require
            ["@mui/icons-material/CheckBoxOutlineBlank" :default CheckBoxOutlineBlank]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box-outline-blank
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBoxOutlineBlank)))