(ns ogbe.fulcro.mui.icons.check-box-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CheckBoxSharp" :default CheckBoxSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-box-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckBoxSharp)))