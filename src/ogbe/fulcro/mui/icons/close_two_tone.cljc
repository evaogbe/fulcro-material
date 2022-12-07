(ns ogbe.fulcro.mui.icons.close-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CloseTwoTone" :default CloseTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseTwoTone)))