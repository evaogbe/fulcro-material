(ns ogbe.fulcro.mui.icons.shuffle-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ShuffleTwoTone" :default ShuffleTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shuffle-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShuffleTwoTone)))