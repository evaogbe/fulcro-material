(ns ogbe.fulcro.mui.icons.flip-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FlipTwoTone" :default FlipTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipTwoTone)))