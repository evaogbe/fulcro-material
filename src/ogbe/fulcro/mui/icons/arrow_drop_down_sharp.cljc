(ns ogbe.fulcro.mui.icons.arrow-drop-down-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ArrowDropDownSharp" :default ArrowDropDownSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-drop-down-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowDropDownSharp)))