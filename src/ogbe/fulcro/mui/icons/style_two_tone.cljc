(ns ogbe.fulcro.mui.icons.style-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StyleTwoTone" :default StyleTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-style-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StyleTwoTone)))