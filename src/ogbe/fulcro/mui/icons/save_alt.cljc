(ns ogbe.fulcro.mui.icons.save-alt
  #?(:cljs (:require
            ["@mui/icons-material/SaveAlt" :default SaveAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAlt)))