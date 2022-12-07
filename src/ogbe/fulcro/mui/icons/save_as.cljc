(ns ogbe.fulcro.mui.icons.save-as
  #?(:cljs (:require
            ["@mui/icons-material/SaveAs" :default SaveAs]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-as
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAs)))