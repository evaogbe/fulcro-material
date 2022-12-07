(ns ogbe.fulcro.mui.icons.desk-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DeskSharp" :default DeskSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-desk-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeskSharp)))