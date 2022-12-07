(ns ogbe.fulcro.mui.icons.add-to-home-screen
  #?(:cljs (:require
            ["@mui/icons-material/AddToHomeScreen" :default AddToHomeScreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-add-to-home-screen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AddToHomeScreen)))