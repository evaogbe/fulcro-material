(ns ogbe.fulcro.mui.icons.save-as-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SaveAsSharp" :default SaveAsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-as-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAsSharp)))