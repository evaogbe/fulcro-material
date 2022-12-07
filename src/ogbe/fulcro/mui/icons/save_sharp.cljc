(ns ogbe.fulcro.mui.icons.save-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SaveSharp" :default SaveSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveSharp)))