(ns ogbe.fulcro.mui.icons.facebook-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FacebookTwoTone" :default FacebookTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-facebook-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FacebookTwoTone)))