(ns ogbe.fulcro.mui.icons.add-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AddTwoTone" :default AddTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddTwoTone)))