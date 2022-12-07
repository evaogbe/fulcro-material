(ns ogbe.fulcro.mui.icons.save-as-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SaveAsTwoTone" :default SaveAsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-as-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveAsTwoTone)))