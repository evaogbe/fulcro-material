(ns ogbe.fulcro.mui.icons.save-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SaveTwoTone" :default SaveTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-save-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SaveTwoTone)))